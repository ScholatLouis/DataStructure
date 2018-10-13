import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class solution_811 {
    public static void main(String[] args) {
        solution_811 solution = new solution_811();
        String[] cpdomains = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        solution.subdomainVisits(cpdomains);
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domain = new HashMap<String, Integer>();
        for(String item : cpdomains) {
            int count = Integer.parseInt(item.split(" ")[0]);
            String subdomain = item.split(" ")[1];
            while(!subdomain.isEmpty()) {
                domain.put(subdomain, domain.getOrDefault(subdomain, 0) + count);
                subdomain = subdomain.indexOf(".") != -1 
                    ? subdomain.substring(subdomain.indexOf(".") + 1)
                    : "";
                System.out.println(subdomain);
                System.out.println(subdomain.isEmpty());
            }
        }
        List<String> domainCount = new ArrayList<String>();
        for(Map.Entry<String, Integer> entry : domain.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
            domainCount.add(entry.getValue() + " " + entry.getKey());
        }
        return domainCount;
    }
}