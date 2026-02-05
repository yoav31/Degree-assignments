def pascal(row,column):
    if column > row or column < 0 or row < 0:
        return -1
    
    if column == 0 or column == row:
        return 1
    
    
    return pascal(row - 1, column - 1) + pascal(row - 1, column)

row=int(input("enter your row:"))
column=int(input("enter your column:"))
print(f"pascal({row},{column})  =>  {pascal(row,column)}")
