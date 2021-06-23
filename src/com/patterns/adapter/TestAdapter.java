package com.patterns.adapter;

public class TestAdapter {
    public static void main(String[] args) {
	LightningCable cable = new LightningToUsbAdapter();

	cable.startConnection();
	cable.stopConnection();
    }
}
