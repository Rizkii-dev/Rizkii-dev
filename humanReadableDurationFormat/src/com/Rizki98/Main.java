package com.Rizki98;


public class Main {

    public static String formatDuration(int seconds) {
        if (seconds != 0){
            String[] det = new String[5];
            det[0] = "year";
            det[1] = "day";
            det[2] = "hour";
            det[3] = "minute";
            det[4] = "second";


            int form = 0;
            int formt = 0;


            int[] tim = new int[5];
            tim[4] = seconds;

            if (tim[4] >= 60){
                tim[3] = tim[4]/60;
                tim[4] %= 60;

                if (tim[3] >= 60){
                    tim[2] = tim[3]/60;
                    tim[3] %= 60;

                    if (tim[2] >= 24){
                        tim[1] = tim[2]/24;
                        tim[2] %= 24;

                        if (tim[1] >= 365){
                            tim[0] = tim[1]/365;
                            tim[1] %= 365;
                        }
                    }
                }
            }


            StringBuilder dur = new StringBuilder();

            for (int j = 0; j < tim.length; j++){
                if (tim[j] != 0){
                    form++;
                }

                if (tim[j] > 1){
                    det[j] += "s";
                }
            }


            for (int i = 0; i < tim.length; i++){
                if (tim[i] != 0){
                    dur.append(tim[i]).append(" ").append(det[i]);

                    formt++;

                    if (formt < form-1){
                        dur.append(", ");
                    }else if (formt == form-1){
                        dur.append(" and ");
                    }
                }
            }



            return String.valueOf(dur);
        }else {
            return "now";
        }

    }

    public static void main(String[] args) {
        int dur = 3600*24 + 3600 + 60 + 1;

        System.out.print(formatDuration(dur));
    }
}
