/*
 Copyright (c) 2018 by ScaleOut Software, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
package com.scaleoutsoftware.digitaltwin.core;

/**
 * Message list factory retrieves message lists for a MessageProcessor
 */
public interface MessageListFactory {
     /**
      * Retrieves a typed message list
      * @param <V> the type of the messages inside the underlying list
      * @return a typed message list
      */
     <V> MessageList<V> getMessageList();

     /**
      * Returns all incoming messages
      * @param <V> the type of incoming messages
      * @return an iterable of incoming messages
      */
     <V> Iterable<V> getIncomingMessages();
}
