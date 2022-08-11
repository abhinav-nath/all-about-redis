import redis

r = redis.Redis(host='localhost', port=6379)

r.set("Spain", "Madrid")
r.set("Canada", "Ottawa")

print(r.get("Spain"))  #  b'Madrid'
print(r.get("Canada"))  #  b'Ottawa'

print("\n")

# mset() accepts a dictionary
r.mset({"Japan": "Tokyo", "Netherlands": "Amsterdam"})

print(r.get("Japan"))  #  b'Tokyo'
print(r.get("Netherlands"))  #  b'Amsterdam'

print("\n")

if(r.exists("Russia")):
    print(r.get("Russia"))
else:
    print("Cannot find the capital of Russia, adding it")
    r.set("Russia", "Moscow")
    print(r.get("Russia"))  #  b'Moscow'