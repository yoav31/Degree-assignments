import random
import animals_list
hangman = [ '''
  +---+
  |   |
  O   |
      |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
  |   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========''','''
  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========''']
from animals_list import animal
str=random.choice(animal)
print(str)
str_list=[]
dash_list=[]
for letter in str:
    str_list.append(letter)
    dash_list.append("_") 

print('''
  +---+
  |   |
      |
      |
      |
      |
=========''')

print(dash_list)
size_str=len(str_list)
count=0
while count != 6: 
    if size_str>0:      
        guess=input("\nGuess a letter: ").lower()
        if guess in str_list:    
            for index in range (len(dash_list)):
                if guess==str_list[index]:
                    size_str-=1
                    dash_list.pop(index)
                    dash_list.insert(index,guess)            
        else:
            print(hangman[count])
            count+=1
            if count==6:
                print("you lose!!") 
        print(dash_list)                   
    else:
        print("you win!!")
        break
