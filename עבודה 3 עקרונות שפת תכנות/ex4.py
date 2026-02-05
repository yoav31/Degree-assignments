
def make_magic_box():
    class magic_box:  
        def __init__(self):
            self.items={}

        def add_item(self,key,func):
            self.items[key]=func

        def remove_item(self,key):
            if key in self.items:
                del self.items[key]

        def list_items(self):
            print("[", end="")
            for key in self.items.keys():
                    print(f"{key}, ", end="" )
            print("]")        

        def use_item(self,key,*args):
            if key in self.items:
                print(self.items[key](*args))

        def get_item(self,key):
            if key in self.items:
                print(self.items[key])


        def dispatch(self,massage):
            if massage=='add_item':
                return self.add_item    
            if massage=='remove_item':
                return self.remove_item
            if massage=='use_item':
                return self.use_item
            if massage=='list_items':
                return self.list_items
            if massage=='get_item':
                return self.get_item
    return magic_box().dispatch


box = make_magic_box()
box('add_item')('Healing Potion', lambda hp: f"Healed {hp} HP")
box('add_item')('Fireball', lambda damage: f"Caused {damage} damage")
box('add_item')('Teleport', lambda x, y: f"Teleported to coordinates ({x}, {y})") 
box('list_items')()
box('use_item')('Healing Potion', 50) 
box('use_item')('Fireball', 100)
box('use_item')('Teleport', 10, 20) 
box('remove_item')('Healing Potion') 
box('list_items')()
box('get_item')('Fireball')