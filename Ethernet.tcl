Create a ns simulator

set ns [new Simulator]

#Setup topography object

set topo [new Topography]

$topo load_flatgrid 1500 1500

#Open the NS trace file

set tracefile [open p4.tr w]

$ns trace-all $tracefile

#Open the NAM trace file

set namfile [open p4.nam w]

$ns namtrace-all $namfile

$ns namtrace-all-wireless $namfile 1500 1500

#===================================

#Mobile node parameter setup

#===================================

$ns node-config -adhocRouting DSDV \

-llType LL \

-macType Mac/802_11 \

-ifqType Queue/DropTail \

-ifqLen 20 \

-phyType Phy/WirelessPhy \

-channelType Channel/WirelessChannel \

-propType Propagation/TwoRayGround \

-antType Antenna/OmniAntenna \

-topoInstance $topo \

-agentTrace ON \

-routerTrace ON

#===================================

#Nodes Definition

#===================================

create-god 6

#Create 6 nodes

set n0 [$ns node]

$n0 set X_ 630

$n0 set Y_ 501

$n0 set Z_ 0.0

$ns initial_node_pos $n0 20

set n1 [$ns node]

$n1 set X_ 454

$n1 set Y_ 340

$n1 set Z_ 0.0

$ns initial_node_pos $n1 20

set n2 [$ns node]

$n2 set X_ 785

$n2 set Y_ 326

$n2 set Z_ 0.0

$ns initial_node_pos $n2 20

set n3 [$ns node]

$n3 set X_ 270

$n3 set Y_ 190

$n3 set Z_ 0.0

$ns initial_node_pos $n3 20

set n4 [$ns node]

$n4 set X_ 539

$n4 set Y_ 131

$n4 set Z_ 0.0

$ns initial_node_pos $n4 20

set n5 [$ns node]

$n5 set X_ 964

$n5 set Y_ 177

$n5 set Z_ 0.0

$ns initial_node_pos $n5 20

#===================================

#Agents Definition

#===================================

#Setup a UDP connection

set udp0 [new Agent/UDP]

$ns attach-agent $n0 $udp0

set null1 [new Agent/Null]

$ns attach-agent $n4 $null1

$ns connect $udp0 $null1

$udp0 set packetSize_ 1500

#Setup a TCP connection

set tcp0 [new Agent/TCP]

$ns attach-agent $n3 $tcp0

set sink1 [new Agent/TCPSink]

$ns attach-agent $n5 $sink1

$ns connect $tcp0 $sink1

#===================================

#Applications Definition

#===================================

#Setup a CBR Application over UDP connection

set cbr0 [new Application/Traffic/CBR]

$cbr0 attach-agent $udp0

$cbr0 set packetSize_ 1000

$cbr0 set rate_ 1.0Mb

$cbr0 set random_ null

#Setup a FTP Application over TCP 

