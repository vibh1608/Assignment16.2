package com.example.user.assignment162;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

//Creating class by extending AppCompatActivity class.
public class MainActivity extends AppCompatActivity
{
    //creating references of classes, elements of which are used in the layout.
    Button download;
    ProgressBar firstBar,secondBar,thirdBar,fourthBar;
    Handler handler = new Handler();   //creating object of Handler class.

    @Override
    //onCreate method.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //Setting content view.

        //Setting references with their IDs.
        download =  findViewById(R.id.downloadbtn);
        firstBar =  findViewById(R.id.progress1);
        secondBar = findViewById(R.id.progress2);
        thirdBar =  findViewById(R.id.progress3);
        fourthBar = findViewById(R.id.progress4);

        //Setting onClick listener to the Button.
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            //Handling onClick event of the Button.
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Download Starting....",Toast.LENGTH_SHORT).show();


                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    firstBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();


                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    secondBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();

                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    thirdBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();

                //Creating Thread using Runnable interface. and starting Thread.
                new Thread(new Runnable() {

                    int i = 0;
                    int progressStatus = 0;

                    //run() method which is overridden.
                    public void run() {
                        //while loop to set the progress to ProgressBar at each instant.
                        while (progressStatus < 100) {
                            progressStatus += doWork();
                            try {
                                Thread.sleep(500);  //Thread sleeping
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            // Update the progress bar
                            handler.post(new Runnable() {
                                public void run() {
                                    fourthBar.setProgress(progressStatus);
                                    i++;
                                }
                            });

                        }
                    }
                    //Updating the parameter which is changing progress on the ProgressBar.
                    private int doWork() {

                        return i * 10;
                    }

                }).start();

                Toast.makeText(getApplicationContext(),"Download Complete",Toast.LENGTH_SHORT).show();

            }
        });

    }
}   //End of MainActivity.


