package com.example.blert_womensafetyapp;


    public interface AccelerometerListener {

        public void onAccelerationChanged(float x, float y, float z);

        public void onShake(float force);


}
