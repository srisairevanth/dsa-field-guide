from collections import deque

class LinkedQueue:
    def __init__(self):
        self.items = deque()

    def push(self, value):
        self.items.append(value)

    def peek(self):
        return self.items[0] if self.items else -1

    def pop(self):
        return self.items.popleft() if self.items else -1

    def empty(self):
        return not self.items
