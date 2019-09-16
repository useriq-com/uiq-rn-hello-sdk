using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Uiq.Rn.Hello.Sdk.RNUiqRnHelloSdk
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNUiqRnHelloSdkModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNUiqRnHelloSdkModule"/>.
        /// </summary>
        internal RNUiqRnHelloSdkModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNUiqRnHelloSdk";
            }
        }
    }
}
