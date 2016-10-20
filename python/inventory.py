# inventory.py
# Cassandra Seney 2016

# Sample code which uses a class, dictionary, list, conditional statements, loops and user input

class Inventory:

    # Initialize the dictionary 
    def __init__(self,stock=None):
        self.stock={"AQT839":["Toyota","Corolla","red","2009"],
                        "TYS157":["Nissan","Versa","white","2013"],
                        "YSP665":["Ford","Focus","blue","2010"],
                        "MHW241":["Kia","Forte","gold","2012"]}

    # Read list index value
    def input_int(self,min=1,max=4):
        value = 0
        while value < min or value > max:
            value = int(input("Enter value [1-4]: "))
        return value

    # Read dictionary key
    def input_name(self,prompt="Enter item name: "):
        name = ""
        name = input(prompt)
        if name not in self.get_item_keys():
            name = "AQT839"
        return name

    # Sorted list of the dictionary keys
    def get_item_keys(self):
            return sorted(self.stock.keys())

    # Element from the ordered list dictionary value
    def get_item_attr(self,i_name="AQT839",i_query=1):
        value = self.stock[i_name][i_query-1] 
        return value 

def run():
    myInv = Inventory()
    i_name = i_query = ""

    # Obtain user input
    print(myInv.get_item_keys())
    i_name = myInv.input_name()
    print("1:make 2:model 3:color 4:year")
    i_query = myInv.input_int()

    # Display the result
    print(i_name + " : " + myInv.get_item_attr(i_name,i_query))   

# execute as a script
if __name__ == "__main__":
    run()




