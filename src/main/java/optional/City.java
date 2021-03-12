package optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    private List<Location> locations;
    protected int[][] distanceMatrix = new int[1000][1000];
    protected final int inf=1000000;

    public City(String name, List<Location> locations) {
        this.name = name;
        this.locations = new ArrayList<>();
        this.locations = locations;
    }



    public String getName() {
        return name;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void addLocation(Location obj)
    {
        locations.add(obj);
    }

    @Override
    public String toString()
    {
        return "City: "+ name+" has the following locations: "+ locations + '\n';
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(locations,name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof City)) {
            return false;
        }
        City cit = (City) obj;
        return Objects.equals(locations,cit.locations) && Objects.equals(name,cit.name);
    }
    public void visitNotPay() {
        List<Location> visitableLocation=new ArrayList<Location>();
        for (Location loc: locations)
        {
            if((loc instanceof Visitable) && !(loc instanceof Payable))
            {
                visitableLocation.add(loc);
            }
        }


        Collections.sort(visitableLocation);


        for(Location location: visitableLocation)
        {
            System.out.println("The name of the location is: "+location.getName()+" and it opens at "+location.getOpeningHours().toString()+"\n");
        }

    }

    public void buildDistanceMatrix()
    {
        int n=locations.size();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(i==j) distanceMatrix[i][j]=0;
                    else
                if (!Objects.isNull(locations.get(i).getDist().get(locations.get(j))))
                    distanceMatrix[i][j]=locations.get(i).getDist().get(locations.get(j));
                else
                    distanceMatrix[i][j]=inf;



        for(int k=0;k<n;k++)
        {
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    if(distanceMatrix[i][k]+distanceMatrix[k][j]<distanceMatrix[i][j])
                    {
                        distanceMatrix[i][j]=distanceMatrix[i][k]+distanceMatrix[k][j];
                    }
        }

    }


    public int getMinimumDistance(int idx1,int idx2)
    {
        return distanceMatrix[idx1][idx2];
    }
}
