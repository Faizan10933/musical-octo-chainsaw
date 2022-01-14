
l=[10000,5000,25000,15000,12000]
p=0
q=0
r=0
s=0
print("total money u can invest: ",sum(l))
print("Your Money in different Banks",l)
n=int(input("Enter amount to invest in mutual funds: "))
if n<=10000 and n>5000:
    l[0]=l[0]-n
elif n==5000 or n<5000:
    l[1]=l[1]-n
elif n<=25000 and n>15000:
    l[2]=l[2]-n
elif n<=15000 and n>12000:
    l[3]=l[3]-n
elif n<=12000 and n>10000:
    l[4]=l[4]-n
elif n>25000:
    p=n-l[2]
    l[2]=l[2]-n+p
    # p=p-p*2

if p<=5000:
    l[1]=l[1]-p
elif p>5000 and p<=10000:
    l[0]=l[0]-p
elif p>10000 and p<=12000:
    l[4]=l[4]-p
elif p>12000 and p<=15000:
    l[3]=l[3]-p
# elif p>15000 and p<=25000:
#     l[3]=l[3]-p
elif p>15000:
    q=p-l[3]
    l[3]=l[3]-p+q

if q<=5000:
    l[1]=l[1]-q
elif q>5000 and q<=10000:
    l[0]=l[0]-q
elif q>10000 and q<=12000:
    l[4]=l[4]-q
elif q>12000:
    r=q-l[4]
    l[4]=l[4]-q+r

if r<=5000:
    l[1]=l[1]-r
elif r>5000 and r<=10000:
    l[0]=l[0]-r
elif r>10000:
    s=r-l[0]
    l[0]=l[0]-r+s

if s<=5000:
    l[1]=l[1]-s

    # q=p-p*2
    print(l)
else:
    print("Insufficient Money")
