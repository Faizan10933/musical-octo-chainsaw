for n in range(1,101):
    s=str(n)
    l=len(s)
    res=0
    for i in range(l):
        res+= int(str(n)[i])**(i+1)

    if res==n:
        print(n)
    else:
        continue
