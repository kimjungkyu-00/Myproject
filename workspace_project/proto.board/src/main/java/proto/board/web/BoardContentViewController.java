package proto.board.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import proto.board.service.BoardContentViewService;

@Controller
public class BoardContentViewController {

    private static final Logger logger = LoggerFactory.getLogger(BoardContentViewController.class);

    @Autowired
    private BoardContentViewService boardContentViewService;

    @RequestMapping(value = "/boardContentView", method = RequestMethod.GET)
    public String boardContentView(Locale locale, Model model) {
        logger.info("Welcome home! the client locale is "+ locale.toString());
        logger.info("Autowired :  "+ boardContentViewService.getBoardContentVO());

        model.addAttribute("val", boardContentViewService.getBoardContentVO() );

        return "boardContentView";
    }
}
