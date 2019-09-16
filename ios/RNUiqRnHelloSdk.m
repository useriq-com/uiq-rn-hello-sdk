
#import "RNUiqRnHelloSdk.h"
#import <UIQHello/UIQTestView.h>

@implementation RNUiqRnHelloSdk

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE(RNUiqRnHelloSdk);

RCT_EXPORT_METHOD(showMessage) {
    [UIQTestView showMessage];
}

@end
  