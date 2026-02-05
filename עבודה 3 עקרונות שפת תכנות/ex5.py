def get_transform_sequence_iterator(arr,func=None):

    class transform_sequence_iterator:

        def __init__(self,arr,func):
             self.arr=arr
             if func==None:
                  self.func=lambda x:x
             else:
                   self.func=func    
             
             self.counter=0

        def next(self):
            if len(self.arr)>self.counter:
                res= self.func(self.arr[self.counter])
                self.counter+=1
                return res
            else:
                return "no more items"

        def has_next(self):
            return self.counter < len(self.arr)

        def reset(self):
            self.counter=0
        def skip(self):
            if len(self.arr)>self.counter:
                res= self.func(self.arr[self.counter])
                self.counter+=1
                return res
            else:
                return "no more items"    
                    
        
        def dispatch(self):
            return {
                'next': self.next,
                'has_next': self.has_next,
                'reset': self.reset,
                'skip':self.skip
                
            }
            
    return transform_sequence_iterator(arr,func).dispatch()     

it = get_transform_sequence_iterator([2, 4, 8], lambda x: x**2)
while it['has_next'](): 
     print(it['next']())
it['reset']()
print(it['next']())
print(it['skip']())
print(it['next']())
it = get_transform_sequence_iterator([2, 4, 8]) 
for i in range(5): 
         print(it['next']()) 