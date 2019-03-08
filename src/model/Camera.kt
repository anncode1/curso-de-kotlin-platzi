package model

class Camera {

    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun cameraStatus(): String {
        return if (isOn) "Camera is Turned" else "Camera is not Turned"
    }

}