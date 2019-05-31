package io.zipcoder;

import java.util.ArrayList;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        // Start at index and count up
        Integer currentIndex = startIndex;
        Integer count = 0;
        Integer distance = playList.length;
        while(!playList[currentIndex].equals(selection)) {

            count++;
            if(currentIndex < playList.length - 1) {
                currentIndex++;
            }
            else {
                currentIndex = 0;
            }
        }

        if(count < distance) distance = count;

        count = 0;
        currentIndex = startIndex;

        // Start at index and count down
        while(!playList[currentIndex].equals(selection)) {

            count++;
            if(currentIndex > 0) {
                currentIndex--;
            }
            else {
                currentIndex = playList.length - 1;
            }
        }

        if(count < distance) distance = count;

        // Return smallest distance
        return distance;

        /*

        // OVER COMPLICATED THIS SECTION.
        // NEXT TIME KEEP IT SIMPLE STUPID

        // find all instances of selection
        ArrayList<Integer> location = new ArrayList<Integer>();
        Integer index = 0;
        for (String song : playList) {

            if(song.equals(selection)) location.add(index);
            index++;

        }



        //find distance depending on position
        Integer distance = playList.length;


        for(int i = 0; i < location.size(); i++) {

            Integer currentDistance = playList.length;

            while()

            //Check Right
            //distance y - x
            //example: 3 - 1 = distance 2
            currentDistance = startIndex - location.get(i);




            //Check Left
            //distance length - y + x
            //example: 7 - 3 + 1 = 5



            //Do this for all positions of selection and find the smallest value
            //Loop and save the smallest value
        }

         */

    }
}
