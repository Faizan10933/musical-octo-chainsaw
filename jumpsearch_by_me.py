import math
key=346
l=[2,3,5,7,8,34,78,99,346,567,568,678,876,984,999]
s=len(l)
jp=math.sqrt(s)
val= math.ceil(jp)
for i in range(0,s,val):
    if l[i]==key:
        print(i)
        break
    elif l[i]>key:
        p=i-val*2
# print(p)
for w in range(p,s):
    if l[w]==key:
        print(w)
            
