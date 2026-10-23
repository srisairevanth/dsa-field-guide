class MyQueue:
    def __init__(self):
        self.inbox = []
        self.outbox = []

    def _move(self):
        if not self.outbox:
            while self.inbox:
                self.outbox.append(self.inbox.pop())

    def push(self, x):
        self.inbox.append(x)

    def peek(self):
        self._move()
        return self.outbox[-1]

    def pop(self):
        self._move()
        return self.outbox.pop()

    def empty(self):
        return not self.inbox and not self.outbox
