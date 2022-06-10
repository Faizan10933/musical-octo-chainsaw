t=input("Enter plain text: ")
pt=t.lower()
key=int(input("Enter key value: "))

alpha="abcdefghijklmnopqrstuvwxyz"
encrypted=""

for c in pt:
    s=alpha.index(c)
    s= s+3

    if s>25:
        s=s%26

    encrypted += alpha[s]

if t.isupper():
    print(encrypted.upper())
else:

    print(encrypted)


