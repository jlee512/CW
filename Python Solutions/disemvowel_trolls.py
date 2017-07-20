import re

def main():
    print(disemvowel("This website is for losers LOL!"))
    print(disemvowel2("This website is for losers LOL!"))

def disemvowel(string):
    regex = '[aeiouAEIOU]'
    disemvoweled = re.sub(regex, "", string)
    return disemvoweled

#translate changes in python3
def disemvowel2(string):
    table = dict.fromkeys(map(ord, "aeiouAEIOU"), None)
    disemvoweled = string.translate(table)
    return disemvoweled

if __name__ == "__main__":
    main()