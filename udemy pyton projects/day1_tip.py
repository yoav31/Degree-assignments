bill=float(input("What is the total bill? "))
persent=int(input("How much persent tip 10,12 or 15? "))
people=int(input("How many people to split the bill? "))
total=(bill/100)*(100+persent)/people
total=round(total,2)
print(f"Each person should pay {total}")