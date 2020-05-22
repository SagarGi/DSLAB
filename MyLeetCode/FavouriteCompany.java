import java.util.ArrayList;
import java.util.List;

public class FavouriteCompany {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> list = new ArrayList<>();
        // search for the list whose length is greater
        List<String> greater = new ArrayList<>();
        int size = 0;
        int index = Integer.MIN_VALUE;
        for(int i = 0; i < favoriteCompanies.size(); i++)
        {
            if(favoriteCompanies.get(i).size() >= size)
            {
                size = favoriteCompanies.get(i).size();
                index = i;
            }
        }

        for(String s : favoriteCompanies.get(index))
        {
            greater.add(s);
        }
        for(int i = 0; i < favoriteCompanies.size(); i++)
        {
            if(i == index)
            {
                list.add(i);
            }
            else
            {
                for(String s : favoriteCompanies.get(i))
                {
                    if(!greater.contains(s))
                    {
                        list.add(i);
                    }
                }
            }
        }

        System.out.println(greater);
        return list;
    }
}

class FavouriteCompanyDemo
{
    public static void main(String[] args) {
       List<List<String>> list = new ArrayList<>();
       
    }
}

// tried but failed some test cases
