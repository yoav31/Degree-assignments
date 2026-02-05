target=int(input("enter your number: "))
sum_evens=0
for num in range(2, target+1, 2):
    sum_evens+=num
print(f"{sum_evens}")   
