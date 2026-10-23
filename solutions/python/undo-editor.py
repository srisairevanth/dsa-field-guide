class Editor:
    def __init__(self):
        self.states = []

    def _current(self):
        return self.states[-1] if self.states else ''

    def type(self, text):
        self.states.append(self._current() + text)

    def undo(self):
        if self.states:
            self.states.pop()
        return self._current()
