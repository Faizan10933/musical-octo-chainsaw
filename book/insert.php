<?php

$id= $_REQUEST['id'];
$name= $_REQUEST['name'];
$price= $_REQUEST['price'];

 $conn=mysqli_connect("localhost","root","","dbs");

 if(!$conn){
 echo "connect erroor".mysqli_error($conn);
 }else{
     $sql="INSERT INTO book VALUES($id,'$name',$price)";
     
 }
 if(mysqli_query($conn, $sql)){
     echo "inserted";
 }
 else{
     echo "not inserted".mysqli_error($conn);
 }
 mysqli_close($conn);
 ?>