print("the love calculator is calculating your score..")
name1=input("name1= ")
name2=input("name2= ")
names=name1+name2
names=names.lower()

t=names.count("t")
r=names.count("r")
u=names.count("u")
e=names.count("e")
total_true=t+r+u+e

l=names.count("l")
o=names.count("o")
v=names.count("v")
e=names.count("e")
total_love=l+o+v+e

total=str(total_true)+str(total_love)
total_int=int(total)
if total_int<10 or total_int>90:
    print("your score is 'x', you togeter like coke and mentos")
elif total_int>=40 and total_int<=50:
    print("your score is 'y', you alright togeter") 
else:
    print("your score is 'z'") 