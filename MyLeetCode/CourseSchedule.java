import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule
{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        int [] indegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        // make a graph using the map 

        for(int i = 0; i < numCourses; i++)
        {
            map.put(i, new ArrayList<Integer>());
        }

        // map the graph accourding to the given 2d array

        for(int i = 0; i < prerequisites.length; i++)
        {
            map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            // get the indegree of the mapped integer
            indegree[prerequisites[i][1]]++;
        }

        // find the indegree whose indegree is 0 which is base accourding ot the khans algorithms

        for(int i = 0; i < numCourses; i++)
        {
            if(indegree[i] == 0)
            {
                queue.add(i);
            }
        }

        while(!queue.isEmpty())
        {
            int temp = queue.poll();
            for(int i : map.get(temp))
            {
                indegree[i]--;
                if(indegree[i] == 0)
                {
                    queue.add(i);
                }
            }
            count++;
        }

        if(count == numCourses)
        {
            return true;
        }

        return false;
    }
}

class CourseScheduleDemo
{
    public static void main(String[] args) {
        int numCourses = 3;
        int prerequisites[][] = {{1,0},{2,1}};
        CourseSchedule cs = new CourseSchedule();
        System.out.println(cs.canFinish(numCourses, prerequisites));
    }
}