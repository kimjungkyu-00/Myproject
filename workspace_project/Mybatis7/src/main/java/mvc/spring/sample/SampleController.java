package mvc.spring.sample;

public class SampleController {
	    Logger log = Logger.getLogger(this.getClass());
	     
	    @Resource(name="sampleService")
	    private SampleService sampleService;
	     
	    @RequestMapping(value="/sample/openSampleBoardList.do")
	    public ModelAndView openSampleBoardList(Map<string,object> commandMap) throws Exception{
	        ModelAndView mv = new ModelAndView("/sample/boardList");
	         
	        List<Map<String,Object>> list = sampleService.selectBoardList(commandMap);
	        mv.addObject("list", list);
	         
	        return mv;
	    }
	}


	출처: https://addio3305.tistory.com/72?category=772645 [흔한 개발자의 개발 노트]