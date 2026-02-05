def prime_checker(number):
    count=0
    for i in range(2,number+1):
        if number%i==0:
            count+=1
    if count==1:
        print(f"{number} is prime number")
    else:
        print(f"{number} is not prime number")   


n = int(input("Enter a number: ")) # Check this number
prime_checker(number=n)