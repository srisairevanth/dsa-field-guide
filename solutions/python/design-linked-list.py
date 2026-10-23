class MyLinkedList:
    def __init__(self):
        self.items = []

    def get(self, index):
        if 0 <= index < len(self.items):
            return self.items[index]
        return -1

    def add_at_head(self, val):
        self.items.insert(0, val)

    def add_at_tail(self, val):
        self.items.append(val)

    def add_at_index(self, index, val):
        if 0 <= index <= len(self.items):
            self.items.insert(index, val)

    def delete_at_index(self, index):
        if 0 <= index < len(self.items):
            del self.items[index]
