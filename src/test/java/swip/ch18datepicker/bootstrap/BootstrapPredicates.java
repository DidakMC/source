package swip.ch18datepicker.bootstrap;



import swip.ch18datepicker.framework.Element;
import swip.ch18datepicker.framework.ExplicitWait;

import java.util.Optional;
import java.util.function.Predicate;

import static swip.ch18datepicker.bootstrap.BootstrapByClassName.CALENDAR;

public enum BootstrapPredicates implements Predicate<ExplicitWait> {

    CALENDAR_CLOSED {
        @Override
        public boolean test(ExplicitWait explicitWait) {
            Optional<Element> element = explicitWait.optionalElement(CALENDAR);
            return !element.isPresent() || !element.get().isDisplayed();
        }
    }

}