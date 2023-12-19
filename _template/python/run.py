import time


def main():
    print("Hello World!")


if __name__ == "__main__":
    start = time.time()
    main()
    end = time.time()
    print("Execute Time: " + str(end - start) + "ms")
