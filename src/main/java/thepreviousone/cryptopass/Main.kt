package thepreviousone.cryptopass

import thepreviousone.cryptopass.gui.Gui

var argSecret = -1
var argUser = -1
var argUrl = -1
var length = 0

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        Gui.run(args)
    } else if (args.contains("-h") || args.contains("--help")) {
        printHelp()
    } else {
        for (i in 0 until args.size step 2) {
            when {
                args[i] == "-k" || args[i] == "--secret" -> argSecret = i
                args[i] == "-u" || args[i] == "--user" -> argUser = i
                args[i] == "-s" || args[i] == "--url" -> argUrl = i
                args[i] == "-l" || args[i] == "--length" -> length = args[i + 1].toInt()
                else -> {
                    Gui.run(args)
                }
            }
        }
        val key = PasswordMaker.make(args[argSecret + 1], args[argUser + 1], args[argUrl + 1])
        print(key.subSequence(0, length))
    }
}

fun printHelp() {
    print("CryptoPass help\n [option]\t\t\t\t[description]\n")
    print("-u --user\t\t\tusername to be used\n")
    print("-s --url\t\t\tsite url pass is to be made for\n")
    print("-k --secret\t\t\tsecret key to be used\n")
    print("-l --length\t\t\tgenerated password length\n")
    print("-d --decode\t\t\tCryptopass encoded key to be decoded\n")
    print("-h --help\t\t\tPrints this message\n\n")
}
