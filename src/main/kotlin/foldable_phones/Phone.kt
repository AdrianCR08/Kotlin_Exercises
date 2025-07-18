package foldable_phones

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    open fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isPhoneFolded: Boolean) : Phone() {
    override fun switchOn() {
        if (!isPhoneFolded) {
            isScreenLightOn = true
            println("Screen turned on")
        } else {
            println("Cannot turn on screen while phone is folded")
        }
    }

    fun fold() {
        isPhoneFolded = true
        switchOff() // turn off the phone when folded
        println("Phone is now folded")
    }

    fun unfold() {
        isPhoneFolded = false
        println("Phone is now unfolded")
    }

    override fun checkPhoneScreenLight() {
        val state = if (isPhoneFolded) "folded" else "unfolded"
        println("The phone is $state")
        super.checkPhoneScreenLight()
    }
}

fun main() {
    val phone = FoldablePhone(false)
    phone.switchOn()
    phone.checkPhoneScreenLight()

    phone.fold()
    phone.switchOn()
    phone.checkPhoneScreenLight()

    phone.unfold()
    phone.switchOn()
    phone.checkPhoneScreenLight()


}
