dic = {0:0}
def process(n):
    if n in dic:
        return dic[n]
    else:
        dic[n] = max(n, process(n//2) + process(n//3) + process(n//4))
        return dic[n]
while True:
    try:
        n = int(input())
        print(process(n))
    except expression as identifier:
        break
    
    