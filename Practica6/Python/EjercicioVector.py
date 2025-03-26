import math
class Vector:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z
    def __add__(self, o):
        return Vector(self.x + o.x, self.y + o.y, self.z + o.z)
    def __sub__(self, o):
        return Vector(self.x - o.x, self.y - o.y, self.z - o.z)
    def producto(self, o):
        return self.x * o.x + self.y * o.y + self.z * o.z
    def croos(self, o):
        return Vector(
            self.y * o.z - self.z * o.y,
            self.z * o.x - self.x * o.z,
            self.x * o.y - self.y * o.x
        )
    def magnitude(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)
    def perpendicular(self, o):
        return self.producto(o) == 0
    def paralelo(self, o):
        cross = self.croos(o)
        return cross.x == 0 and cross.y == 0 and cross.z == 0
    def proyeccion(self, o):
        s = self.producto(o) / o.producto(o)
        return Vector(o.x * s, o.y * s, o.z * s)
    def representacion(self):
        return f"({self.x}, {self.y}, {self.z})"