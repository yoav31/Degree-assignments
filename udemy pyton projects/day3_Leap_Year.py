year=int(input("Enetr a year: "))
if(year&4 == 0):
    if(year%100==0):
        if(year%400==0):
            print(f"the year {year} is leap year")
        else:
            print(f"the year {year} is not leap year")
    else:
         print(f"the year {year} is leap year")       
else:
    print(f"the year {year} is not leap year")  
