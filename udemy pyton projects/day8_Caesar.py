alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
             'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
               's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
               'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 
               'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
               'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
             
direction = input("Type 'encode' to encrypt, type 'decode' to decrypt:\n")
text = input("Type your message:\n").lower()
shift = int(input("Type the shift number:\n"))
while shift>25 or shift<=0 :
  print("error, your shift need to be 1-25")
  shift = int(input("Type the shift number:\n"))
def encrypt(text, shift):
  word=""
  for letter in text:
    position=alphabet.index(letter)+shift
    word+=alphabet[position]
  return word 

def decrypt(text, shift):
  word=""
  for letter in text:
    position=alphabet.index(letter)-shift
    word+=alphabet[position]
  return word     
  
if direction=="encode":
  answer=encrypt(text, shift)
  print(f"the encrypt word is: {answer}")

else:
  answer=decrypt(text, shift)
  print(f"the decrypt word is: {answer}")

