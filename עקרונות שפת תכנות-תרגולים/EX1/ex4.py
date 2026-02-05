num1=int(input("number one: "))
num2=int(input("number two: "))

if num1-num2==0:
    print(f"the gcd is: {num2}")
    quit()

gcd=0
if num1>num2:
       for i in range(num2,0,-1):
            if num1%i==0 and num2%i==0:
                    gcd=i
                    print(f"the gcd is: {gcd}")
                    quit()
if num2>num1:
       for i in range(num1,0,-1):
            if num1%i==0 and num2%i==0:
                gcd=i
                print(f"the gcd is: {gcd}")
                quit()            
    
