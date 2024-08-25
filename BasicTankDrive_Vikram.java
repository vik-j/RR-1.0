package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class BasicTankDrive_Vikram extends LinearOpMode {
    public DcMotor left,right;

    @Override
    public void runOpMode() throws InterruptedException {
        left = hardwareMap.get(DcMotor.class, "left");
        right = hardwareMap.get(DcMotor.class, "right");

        waitForStart();

        while (opModeIsActive() && !isStopRequested()) {
            left.setPower(-gamepad1.left_stick_x);
            right.setPower(-gamepad1.right_stick_x);
        }
    }
}
