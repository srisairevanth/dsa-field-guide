class BrowserHistory:
    def __init__(self, homepage):
        self.pages = [homepage]
        self.pos = 0

    def visit(self, url):
        del self.pages[self.pos + 1:]
        self.pages.append(url)
        self.pos += 1

    def back(self, steps):
        self.pos = max(0, self.pos - steps)
        return self.pages[self.pos]

    def forward(self, steps):
        self.pos = min(len(self.pages) - 1, self.pos + steps)
        return self.pages[self.pos]
