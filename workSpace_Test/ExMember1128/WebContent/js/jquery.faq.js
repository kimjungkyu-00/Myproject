(function($){
    $.fn.faq = function(){
        var ts = $(this);
        $.each(ts, function(i,elem){
            $('button',elem).on('click',faqFunc);
           function faqFunc(){
               if($(this).parent().next().is(":hidden")){
                   $("li>div:visible",elem).hide();
                   $(this).parent().next().show();
               }else{
                   $("li>div:visible",elem).hide();
               }
           }
        });
    };
})(jQuery);