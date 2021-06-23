package com.patterns.adapter;

public class LightningToUsbAdapter implements LightningCable {
    UsbSocket usbSocket = new UsbSocket();

    @Override
    public void startConnection() {
        usbSocket.plugInUsb();
    }

    @Override
    public void stopConnection() {
        usbSocket.plugOutUsb();
    }
}
