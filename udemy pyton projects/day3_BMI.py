hight=float(input("Enter your hight: "))
weight=float(input("Enter your wight: "))
BMI=weight/(hight**2)
BMI=round(BMI,2)
if BMI<18.5:
    print(f"your BMI is {BMI}, is under weight")
elif BMI<25:
    print(f"your BMI is {BMI}, is normal weight")  
elif BMI<30:
      print(f"your BMI is {BMI}, is little over weight")  
elif BMI<35:
      print(f"your BMI is {BMI}, is obese")
else:
      print(f"your BMI is {BMI}, is very obese")       

