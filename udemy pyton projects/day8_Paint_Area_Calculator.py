import math
def paint_calc(height, width, cover):
     cans=float((height*width)/cover)
     print(f"you will need {math.ceil(cans)} cans")

test_h = int(input()) # Height of wall (m)
test_w = int(input()) # Width of wall (m)
coverage = 5
paint_calc(height=test_h, width=test_w, cover=coverage)