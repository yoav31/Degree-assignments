def isPrimary(num,index):
  if index>num/2:
    return True
  if num%index==0:
    return False
  return isPrimary(num,index+1)  

num=int(input("enter your number: "))
print(f"isPrimary({num})  => {isPrimary(num,2)}")