line1=[" "," "," "]
line2=[" "," "," "]
line3=[" "," "," "]
map=[line1,line2,line3]
print("Hiding your treasure! X marks the spot.")
position=input("Where do you want to put the treasure? ")
position_letter=['A','B','C']
letter_index=position_letter.index(position[0])
number_index=int(position[1])-1  
map[letter_index][number_index]="X"                                                
print(f"{line1}\n{line2}\n{line3}")