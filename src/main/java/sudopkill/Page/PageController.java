package sudopkill.Page;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by harisghauri on 3/9/2017.
 */

@RestController
public class PageController {

    @Autowired
    private PageRepository pageRepository;

    @RequestMapping("/pages")
    public List<Page> getPages(){
        List<Page> pages = new ArrayList<>();
        pageRepository.findAll().forEach(pages::add);
        return pages;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/pages")
    public void addPage(@RequestBody Page page){
        pageRepository.save(page);
    }

}
