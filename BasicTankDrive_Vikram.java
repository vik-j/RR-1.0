package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import static org.firstinspires.ftc.teamcode.BasicTankDrive_Vikram.TurnDirection.*;

public class BasicTankDrive_Vikram extends LinearOpMode {
    public DcMotor fl, fr, bl, br;

    public boolean GoodSteering = false;
    public enum TurnDirection {
        LEFT,RIGHT
    }

    public void setLeftMotors(double power) {
        fl.setPower(power);
        bl.setPower(power);
    }
    public void setRightMotors(double power) {
        fr.setPower(power);
        br.setPower(power);
    }

    @Override
    public void runOpMode() throws InterruptedException {
        fl = hardwareMap.get(DcMotor.class, "Front Left");
        fr = hardwareMap.get(DcMotor.class, "Front Right");
        bl = hardwareMap.get(DcMotor.class, "Back Left");
        br = hardwareMap.get(DcMotor.class, "Back Right");

        TurnDirection direction = null;

        waitForStart();

        while (opModeIsActive() && !isStopRequested()) {
            double leftY = -gamepad1.left_stick_y;
            double rightY = -gamepad1.right_stick_y;

            setLeftMotors(leftY);
            setRightMotors(rightY);

        }
    }
}
