def countDigits(num):
  if num==0:
    return 0
   
  return 1+countDigits(num//10)
  
def maxDigit(num,max):
   if num==0:
       return max
   if num%10>max:
       max=num%10       
   return maxDigit(num//10,max)
   
num=int(input("enter your number:"))
count=countDigits(num)
max=maxDigit(num,0)
print(f"countDigits({num}) => {count}") 
print (f"maxDigit({num})  =>  {max}")
print(f"value({num}) => {max+count} ({max}+{count})  ")
